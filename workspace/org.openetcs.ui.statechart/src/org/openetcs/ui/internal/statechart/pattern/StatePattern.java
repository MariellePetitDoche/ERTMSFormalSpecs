package org.openetcs.ui.internal.statechart.pattern;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.AbstractPattern;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.openetcs.model.ertmsformalspecs.State;
import org.openetcs.model.ertmsformalspecs.StateMachine;

public class StatePattern extends AbstractPattern {

	private static final IColorConstant FOREGROUND = new ColorConstant(98, 131,
			167);

	private static final IColorConstant BACKGROUND = new ColorConstant(187,
			218, 247);
	private static final IColorConstant TEXT_FOREGROUND = IColorConstant.BLACK;

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		return mainBusinessObject instanceof State;
	}

	@Override
	protected boolean isPatternControlled(PictogramElement pictogramElement) {
		Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
		return isMainBusinessObjectApplicable(domainObject);
	}

	@Override
	protected boolean isPatternRoot(PictogramElement pictogramElement) {
		Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
		return isMainBusinessObjectApplicable(domainObject);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof State;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		State addedClass = (State) context.getNewObject();

		ContainerShape container = context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		ContainerShape containerShape = peCreateService.createContainerShape(
				container, true);

		// define a default size for the shape
		final int width = context.getWidth() <= 0 ? 100 : context.getWidth();
		final int height = context.getHeight() <= 0 ? 50 : context.getHeight();
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle; // need to access it later

		{
			// create and set graphics algorithm
			roundedRectangle = gaService.createRoundedRectangle(containerShape,
					5, 5);
			roundedRectangle.setForeground(manageColor(FOREGROUND));
			roundedRectangle.setBackground(manageColor(BACKGROUND));

			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, context.getX(),
					context.getY(), width, height);

			// if added Class has no resource we add it to the resource
			// of the diagram
			if (addedClass.eResource() == null) {
				StateMachine stateMachine = (StateMachine) getBusinessObjectForPictogramElement(containerShape);
				stateMachine.getStates().add(addedClass);
			}

			// create link and wire it
			link(containerShape, addedClass);
		}

		// SHAPE WITH LINE
		{
			// create shape for line
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set graphics algorithm
			Polyline polyline = gaService.createPolyline(shape, new int[] { 0,
					20, width, 20 });
			polyline.setForeground(manageColor(FOREGROUND));

			polyline.setLineWidth(2);
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createText(shape, addedClass.getName());
			text.setForeground(manageColor(TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			// vertical alignment has as default value "center"
			text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
			gaService.setLocationAndSize(text, 0, 0, width, 20);

			// create link and wire it
			link(shape, addedClass);
		}
		//ADD ANCHOR(S)
		{
			peCreateService.createChopboxAnchor(containerShape);
		}
		
		layoutPictogramElement(containerShape);
		return containerShape;
	}

	@Override
	public String getCreateName() {
		return "State";
	}
	
	public boolean canLayout(ILayoutContext context) {
	       return true;
	    }
	 
	    public boolean layout(ILayoutContext context) {
	        boolean anythingChanged = false;
	        ContainerShape containerShape =
	            (ContainerShape) context.getPictogramElement();
	        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
	 
//	        // height
//	        if (containerGa.getHeight() < MIN_HEIGHT) {
//	            containerGa.setHeight(MIN_HEIGHT);
//	            anythingChanged = true;
//	        }
//	 
//	        // width
//	        if (containerGa.getWidth() < MIN_WIDTH) {
//	            containerGa.setWidth(MIN_WIDTH);
//	            anythingChanged = true;
//	        }
	 
	        int containerWidth = containerGa.getWidth();
	        
	        for (Shape shape : containerShape.getChildren()){
	            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
	            IGaService gaService = Graphiti.getGaService();
	            IDimension size = 
	                 gaService.calculateSize(graphicsAlgorithm);
	            if (containerWidth != size.getWidth()) {
	                if (graphicsAlgorithm instanceof Polyline) {
	                    Polyline polyline = (Polyline) graphicsAlgorithm;
	                    Point secondPoint = polyline.getPoints().get(1);
	                    Point newSecondPoint =
	                        gaService.createPoint(containerWidth, secondPoint.getY()); 
	                    polyline.getPoints().set(1, newSecondPoint);
	                    anythingChanged = true;
	                } else {
	                    gaService.setWidth(graphicsAlgorithm,
	                        containerWidth);
	                    anythingChanged = true;
	                }
	            }
	        }
	        return anythingChanged;
	    }

		@Override
		protected void postMoveShape(IMoveShapeContext context) {
			super.postMoveShape(context);
			State state=(State)getBusinessObjectForPictogramElement(context.getPictogramElement());
			state.setX(context.getX());
			state.setY(context.getY());
		}

		@Override
		public void resizeShape(IResizeShapeContext context) {
			super.resizeShape(context);
			State state=(State)getBusinessObjectForPictogramElement(context.getPictogramElement());
			state.setWidth(context.getWidth());
			state.setHeight(context.getHeight());
			state.setX(context.getX());
			state.setY(context.getY());
		}
	    
	    
}

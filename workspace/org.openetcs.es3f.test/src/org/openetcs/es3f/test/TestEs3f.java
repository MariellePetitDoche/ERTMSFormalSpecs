package org.openetcs.es3f.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openetcs.es3f.ExportUtil;
import org.openetcs.es3f.ImportUtil;
import org.xml.sax.SAXException;

@SuppressWarnings("restriction")
public class TestEs3f {

	private static File importFile;
	private static File exportFile;
	private static ECPProject project;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		project = ECPProjectManager.INSTANCE.createProject(
				EMFStoreProvider.INSTANCE, "importedProject");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {
		ImportUtil.importModel(importFile, project);
		ExportUtil.exportModel(project, exportFile);

		XMLUnit.setIgnoreComments(true);
		XMLUnit.setIgnoreAttributeOrder(true);
		XMLUnit.setIgnoreWhitespace(true);
		try {
			FileReader irImport = new FileReader(importFile);
			FileReader irExport = new FileReader(exportFile);
			Diff diff = XMLUnit.compareXML(irImport, irExport);
			assertTrue(diff.similar());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (SAXException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}

Juan 07/07/2011

1_3_0_binaries

    The original binaries as downloaded from Empira.
    They are extremely slow when building long tables.
    They are not used anymore in CSLIB.

1_3_1_binaries_patched

    The binaries build from patched sources (see below).

1_3_1_sourcess_patched.zip

    Holds the PdfSharp 1.3.0 sources.
    Patched with  'TableRendering.patch' (see inside ZIP)

    Unzip this file, change dir to 1_3_1_sourcess_patched and run make (or make clean).
    The source are compiled with MSBuild and copied to ../1_3_1_binaries_patched


package org.approvaltests.reporters.macosx;

import java.util.List;

import org.approvaltests.reporters.DiffInfo;
import org.approvaltests.reporters.GenericDiffReporter;

import com.spun.util.ArrayUtils;

public class DiffPrograms
{
  private static final List<String> TEXT           = GenericDiffReporter.TEXT_FILE_EXTENSIONS;
  private static final List<String> IMAGE          = GenericDiffReporter.IMAGE_FILE_EXTENSIONS;
  private static final List<String> TEXT_AND_IMAGE = ArrayUtils.combine(TEXT, IMAGE);
  public static class Mac
  {
    public static DiffInfo DIFF_MERGE     = new DiffInfo("/Applications/DiffMerge.app/Contents/MacOS/DiffMerge",
        "%s %s --nosplash", TEXT);
    public static DiffInfo BEYOND_COMPARE = new DiffInfo("/Applications/Beyond Compare.app/Contents/MacOS/bcomp",
        TEXT);
    public static DiffInfo KALEIDOSCOPE   = new DiffInfo("/Applications/Kaleidoscope.app/Contents/MacOS/ksdiff",
        TEXT_AND_IMAGE);
    public static DiffInfo KDIFF3         = new DiffInfo("/Applications/kdiff3.app/Contents/MacOS/kdiff3",
        "%s %s -m", TEXT);
    public static DiffInfo P4MERGE        = new DiffInfo("/Applications/p4merge.app/Contents/MacOS/p4merge",
        TEXT_AND_IMAGE);
    public static DiffInfo TK_DIFF        = new DiffInfo("/Applications/TkDiff.app/Contents/MacOS/tkdiff", TEXT);
  }
}
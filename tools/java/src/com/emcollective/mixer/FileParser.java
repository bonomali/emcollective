package com.emcollective.mixer;

import java.io.*;

public class FileParser {

  /*
  going to start with a dead simple, stupid format.

  ---- BEGINNING OF FILE
  meta.name "Stairway to Heaven"
  meta.description {
    This is a song about fairies in a hedgerow.
  }
  > drums.aiff {
    0-800 @.4
    1000=800 @.4
  }
  > singing.wav {
    10 @.5
  }
  > bass.wav "10 @.5"
  ----- END OF FILE
   */

  public void parse(String filename) {
    try {
      File file = new File(filename);
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line;
      while ((line = reader.readLine()) != null) {

      }
    } catch (FileNotFoundException fnfe) {
      System.err.println("could not find " + filename + fnfe);
    } catch (IOException ioe) {
      System.err.print("io error reading " + filename);
    }
  }
}

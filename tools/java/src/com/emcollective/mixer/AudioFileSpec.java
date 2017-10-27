package com.emcollective.mixer;

import java.util.List;

public class AudioFileSpec {
  private String filename;
  private List<Region> regions;

  private class Region {
    long startTimeMillis;
    long stopTimeMillis;
    double level;
  }
}

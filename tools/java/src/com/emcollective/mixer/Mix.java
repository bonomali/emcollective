package com.emcollective.mixer;

import java.util.List;
import java.util.ArrayList;

public class Mix {
  private String description;
  private List<AudioFileSpec> audioFileSpecs = new ArrayList<>();

  public setDescription(String description) {
    this.description = description;
  }

  public addAudioFileSpec(AudioFileSpec audioFileSpec) {
    audioFileSpecs.add(audioFileSpec);
  }

  public List<AudioFileSpec> getAudioFileSpecs() {
    return this.audioFileSpecs;
  }
}


package com.emcollective.mixer;

public class Mixer {
  private FileParser fileParser = new FileParser();
  private AudioFileMerger audioFileMerger = new AudioFileMerger();

  public static void main(String[] args) {
    new Mixer().run(args);
  }

  private void run(String[] args) {
    for (String arg : args) {
      parseAndMergeFile(arg);
    }
  }

  private void parseAndMergeFile(String filename) {
    Mix mix = fileParser.parse(filename);
    String outFileName = audioFileMerger.merge(mix.getAudioFiles());
    System.out.println("merged to " + outFileName);
  }
}

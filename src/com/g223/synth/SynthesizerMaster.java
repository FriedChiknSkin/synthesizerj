package com.g223.synth;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SynthesizerMaster {
  private JFrame frame = new JFrame ( "Synthesizer Master");

  SynthesizerMaster()
  {
      frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      frame.setSize(613, 357);
      frame.setResizable(false);
      frame.setLayout(null);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
  }

  public static class AudioInfo {
      
  }
}

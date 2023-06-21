package com.dimasco.sample.kafkaspringexactlyonce.processing.model;

import lombok.Data;

@Data
public class DummyMessage {
  private String uniqueId;
  private String name;
  private String value;

}

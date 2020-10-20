package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.selfSerializer.Date2LongSerializer;
import com.thoughtworks.capability.gtb.selfSerializer.EventTypeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  @JsonSerialize(using = EventTypeSerializer.class)
  private EventType type;
  @JsonSerialize(using = Date2LongSerializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}

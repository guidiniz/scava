package com.padual.scava

import org.springframework.stereotype.Component
import java.text.MessageFormat

@Component
class BeanB {
  
  def getSometext: String = {
    var msg = MessageFormat.format("{0}, written in Scala", this.getClass.getSimpleName)
    msg
  }
  
}
package br.dslcross.crossplatform.generator;

import br.dslcross.crossplatform.crossPlatform.Attribute;
import br.dslcross.crossplatform.crossPlatform.Entity;
import br.dslcross.crossplatform.crossPlatform.Type;
import com.google.common.collect.Iterables;

@SuppressWarnings("all")
public class VelocityType {
  private Type attType;
  
  public VelocityType(final Type t) {
    this.attType = t;
  }
  
  public Iterable<Attribute> getAttributes() {
    final Type attType = this.attType;
    boolean _matched = false;
    if (attType instanceof Entity) {
      _matched=true;
      return Iterables.<Attribute>filter(((Entity)this.attType).getFeatures(), Attribute.class);
    }
    return null;
  }
  
  public String getName() {
    return this.attType.getName();
  }
}

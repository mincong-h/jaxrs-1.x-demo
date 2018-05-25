package io.mincong.shop.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class ShopApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> set = new HashSet<>();
    set.add(ProductResourceImpl.class);
    return set;
  }

}

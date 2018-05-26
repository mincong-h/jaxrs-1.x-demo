package io.mincong.shop.rest;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
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

  @Override
  public Set<Object> getSingletons() {
    Set<Object> set = new HashSet<>();
    set.add(new JacksonJsonProvider());
    return set;
  }
}

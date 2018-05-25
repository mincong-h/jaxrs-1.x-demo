package io.mincong.shop.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Product resource integration test.
 *
 * @author Mincong Huang
 */
public class ProductResourceIT {

  private HttpServer server;

  private WebResource wr;

  @Before
  public void setUp() throws Exception {
    server = Main.startServer();
    wr = Client.create().resource(Main.BASE_URI.resolve("products"));
  }

  @After
  public void tearDown() {
    server.stop();
  }

  @Test
  public void getProduct() {
    String s = wr.path("123").get(String.class);
    assertThat(s).isEqualTo("{\"id\":\"123\",\"name\":\"foo\"}");
  }
}

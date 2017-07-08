package com.soundsystem.componentscan;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class EnvironmentInjectionTest {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfig.class)
  public static class InjectFromProperties {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Beatles", blankDisc.getArtist());
      assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
      System.out.println("2D4294CB8D5B15E18CD09D74B560E149".equalsIgnoreCase("2D4294CB8D5B15E18CD09D74B560e149"));
    }
    
  }

}
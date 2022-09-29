package com.kpi.overrideandoverloading;

/**
 * @author PiyushBodhani
 *
 */
public interface Add {
	
  default int add(int a , int b)
  {
	  return a+b;
  }
}

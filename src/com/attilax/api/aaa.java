/**
 * 
 */
package com.attilax.api;

import com.attilax.core;
import com.attilax.tryX;

/**
 * @author ASIMO
 *
 */
public class aaa {
	
	public static void main(String[] args) {
		try {
			throw new RuntimeException("my exc msg");
		} catch (Exception e) {
			System.out.println(core.toJsonStrO88(e));
		}
	}

}

package com.attilax.io;

import java.io.File;
import java.io.IOException;

import com.attilax.Closure;
import com.attilax.time.timeUtil;
import com.attilax.util.dirx;

public class modifyTimeX {
	
	public static void main(String[] args) throws IOException {
		final filex fx=new filex("c:\\f2.txt");
		dirx.trave("D:\\My Documents\\Tencent Files\\312153274\\FileRecv\\hx_taxi", new Closure() {

		 

			@Override
			public Object execute(Object f) throws Exception {
				File file = new File(f.toString());

				 

				long time = file.lastModified();
				String tm=timeUtil.toTimeStr(time);
				String line=f.toString()+","+tm;
				fx.appendLine_flush_safe(line);
				return null;
			}
		});
		fx.close();
		System.out.println("--f");
	}

}

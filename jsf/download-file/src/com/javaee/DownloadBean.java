package com.javaee;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class DownloadBean implements Serializable {

	private FacesContext facesContext;
	private ExternalContext externalContext;
	
	public String download() {
		HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		
		response.setHeader("Content-Disposition", "attachment;filename=\"nome.pdf\"");
		response.setContentType("application/pdf");
		
		int totalBytes;
		
		try(InputStream in = externalContext.getResourceAsStream("/WEB-INF/arquivo.pdf")){
			OutputStream out = response.getOutputStream();
			
			totalBytes = copy(in, out);
			
		} catch(IOException e){
			throw new RuntimeException(e);
		}
		
		return null;
	}

	private int copy(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		int totalBytes = 0;
		
		while (true) {
			len = in.read(buffer);
			if (len < 0) {
				break;
			}
			totalBytes += len;
			out.write(buffer, 0, len);
		}
		
		return totalBytes;
	}
}

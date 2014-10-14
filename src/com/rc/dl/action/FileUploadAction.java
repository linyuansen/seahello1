package com.rc.dl.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware{
	

		private File userImage;

		private String userImageContentType;

		private String userImageFileName;

		public String execute() throws IOException
		{
			 String realpath = ServletActionContext.getServletContext().getRealPath("/files");
		        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images
		        System.out.println("realpath: "+realpath);
		        if (userImage != null) {
		            File savefile = new File(new File("D:\\files\\"), userImageFileName);
		            if (!savefile.getParentFile().exists())
		                savefile.getParentFile().mkdirs();
		            FileUtils.copyFile(userImage, savefile);
		            ActionContext.getContext().put("message", "文件上传成功");
		        }
			return SUCCESS;
		}

		public File getUserImage() {
			return userImage;
		}

		public void setUserImage(File userImage) {
			this.userImage = userImage;
		}

		public String getUserImageContentType() {
			return userImageContentType;
		}

		public void setUserImageContentType(String userImageContentType) {
			this.userImageContentType = userImageContentType;
		}

		public String getUserImageFileName() {
			return userImageFileName;
		}

		public void setUserImageFileName(String userImageFileName) {
			this.userImageFileName = userImageFileName;
		}

		@Override
		public void setServletResponse(HttpServletResponse arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setServletRequest(HttpServletRequest arg0) {
			// TODO Auto-generated method stub
			
		}

}



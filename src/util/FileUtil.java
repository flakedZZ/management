package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileUtil {
	/**
	 * 上传文件
	 * 
	 * @param file
	 *            需要上传的文件内容
	 * @param fileName
	 *            保存文件时新的名字
	 * @param path
	 *            保存文件的真实路径
	 */
	public  void uploadFile(File file, String fileName, String path) {
		// 创建输入流
		InputStream stream = null;
		// 创建输入流
		FileOutputStream out = null;
		try {
			// 把文件读入
			stream = new FileInputStream(file);
			// 创建准备写入新文件的输出流
			out = new FileOutputStream(path + "/" + fileName);
			int bytesRead = 0;
			byte[] buffer = new byte[1024];
			while ((bytesRead = stream.read(buffer, 0, 1024)) != -1) {
				// 把文件写入服务器中的新文件
				out.write(buffer, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				out.close();
				stream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param path
	 *            要删除文件的真实路径
	 * @param image_url
	 *            要删除文件的网络路径
	 */
	public static void deleteFile(String path, String image_url) {
		File file = new File(path + "/" + getRealName(image_url));
		file.delete();
	}

	/**
	 * 生成新的文件名 防止文件名重复
	 * 
	 * @param fileName
	 * @return
	 */
	public  String getFileName(String fileName) {
		int index = fileName.lastIndexOf(".");
		String extension = fileName.substring(index);
		return System.currentTimeMillis() + extension;
	}

	/**
	 *得到文件的真实名字
	 * 
	 * @param image_url
	 *            要删除文件的网络路径
	 */
	public static String getRealName(String image_url) {
		int index = image_url.lastIndexOf("/");
		String realName = image_url.substring(index + 1);
		return realName;
	}

	public static void main(String[] args) {
		//System.out.println(getFileName("xiaomi.jpg"));
		//System.out.println(getRealName("images/test.jpg"));
	}

}

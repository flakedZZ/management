package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileUtil {
	/**
	 * �ϴ��ļ�
	 * 
	 * @param file
	 *            ��Ҫ�ϴ����ļ�����
	 * @param fileName
	 *            �����ļ�ʱ�µ�����
	 * @param path
	 *            �����ļ�����ʵ·��
	 */
	public  void uploadFile(File file, String fileName, String path) {
		// ����������
		InputStream stream = null;
		// ����������
		FileOutputStream out = null;
		try {
			// ���ļ�����
			stream = new FileInputStream(file);
			// ����׼��д�����ļ��������
			out = new FileOutputStream(path + "/" + fileName);
			int bytesRead = 0;
			byte[] buffer = new byte[1024];
			while ((bytesRead = stream.read(buffer, 0, 1024)) != -1) {
				// ���ļ�д��������е����ļ�
				out.write(buffer, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			try {
				out.close();
				stream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/**
	 * ɾ���ļ�
	 * 
	 * @param path
	 *            Ҫɾ���ļ�����ʵ·��
	 * @param image_url
	 *            Ҫɾ���ļ�������·��
	 */
	public static void deleteFile(String path, String image_url) {
		File file = new File(path + "/" + getRealName(image_url));
		file.delete();
	}

	/**
	 * �����µ��ļ��� ��ֹ�ļ����ظ�
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
	 *�õ��ļ�����ʵ����
	 * 
	 * @param image_url
	 *            Ҫɾ���ļ�������·��
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

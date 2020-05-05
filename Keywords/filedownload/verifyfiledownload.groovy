package filedownload

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

public class verifyfiledownload {


	//String DownloadPath = 'C:\\Users\\montbaga\\Downloads'
	//String fileName = 'Orders export overview'

	@Keyword

	public boolean isFileDownloaded(String downloadPath, String fileName) {

		File dir = new File(downloadPath);

		File[] dirContents = dir.listFiles();



		if (dirContents.length > 0) {

			for (int i = 0; i < dirContents.length; i++) {

				if (dirContents[i].getName().contains(fileName)) {

					dirContents[i].delete();


					KeywordUtil.markPassed("The File was downloaded , regexed with and ultimately deleted from the folder")
				}
			}
		}
	}
}
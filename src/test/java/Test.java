import com.github.wget.CMN;
import com.github.wget.WGet;
import com.github.wget.info.DownloadInfo;

import java.io.File;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.baidu.com");
			DownloadInfo info = new DownloadInfo(url);
			info.extract(new AtomicBoolean(), new Runnable() {
				@Override
				public void run() {
				}
			});
			info.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4840.0 Safari/537.36");
			WGet w = new WGet(info, new File("D:\\download.tmp"));
			w.download(new AtomicBoolean(), new Runnable() {
				@Override
				public void run() {
				}
			});
		} catch (Exception e) {
			CMN.debug(e);
		}
	}
}

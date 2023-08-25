package online.ruin_of_future.reporter

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


class HTTPGetter {
    private var client = OkHttpClient()

    @Throws(IOException::class)
    suspend fun get(url: String): String {
        val request: Request = Request.Builder()
            .url(url)
//            .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
////            .addHeader("Accept-Encoding", "gzip, deflate, br")
//            .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
//            .addHeader("Cache-Control", "no-cache")
//            .addHeader("Cookie","_xsrf=bCXoBS8PERPXBBtvX0hPMBXggomyIs7z; KLBRSID=57358d62405ef24305120316801fd92a|1692977046|1692977036")
//            .addHeader("Pragma", "no-cache")
//            .addHeader("Sec-Ch-Ua", "\"Chromium\";v=\"116\", \"Not)A;Brand\";v=\"24\", \"Google Chrome\";v=\"116\"")
//            .addHeader("Sec-Ch-Ua-Mobile", "?0")
//            .addHeader("Sec-Ch-Ua-Platform", "\"Windows\"")
//            .addHeader("Sec-Fetch-Dest", "document")
//            .addHeader("Sec-Fetch-Mode", "navigate")
//            .addHeader("Sec-Fetch-Site", "none")
//            .addHeader("Sec-Fetch-User", "?1")
//            .addHeader("Upgrade-Insecure-Requests", "1")
//            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")
            .build()
        client.newCall(request).execute().use { response -> return response.body!!.string() }
    }
}
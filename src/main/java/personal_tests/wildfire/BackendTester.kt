package personal_tests.wildfire

import org.apache.hc.client5.http.classic.methods.HttpPost
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity
import org.apache.hc.client5.http.impl.classic.HttpClients
import org.apache.hc.core5.http.io.entity.EntityUtils
import org.apache.hc.core5.http.message.BasicNameValuePair


private const val URL = "http://app.crushconnect.us/app/backend.php"
fun main() {
    val client = HttpClients.createDefault()
    val request = HttpPost(URL)
    val params = ArrayList<BasicNameValuePair>()
    params.add(BasicNameValuePair("op", "7"))
    params.add(BasicNameValuePair("un", "qwerty"))
    params.add(BasicNameValuePair("pw", "1234"))
    request.entity = UrlEncodedFormEntity(params)
    client.execute(request) {
        println("${it.code}\n\n${EntityUtils.toString(it.entity)}")
    }
}
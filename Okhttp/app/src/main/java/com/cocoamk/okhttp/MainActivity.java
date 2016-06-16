package com.cocoamk.okhttp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {


    private String myUrl = "http://project.lanou3g.com/teacher/yihuiyun/lanouproject/activitylist.php";
    private String fileUrl = "http://lizhongren.com.cn/uploadtest/uploadHandler.php";
    private Button testBtn;
    // 要上传的文件路径，理论上可以传输任何文件，实际使用时根据需要处理
    private String uploadFile = "/sdcard/testimg.jpg";
    private String srcPath = "/sdcard/testimg.jpg";
    // 服务器上接收文件的处理页面，这里根据需要换成自己的
    private String actionUrl = "http://lizhongren.com.cn/uploadtest/uploadHandler.php";
    private String actionUrl2 = "http://lizhongren.com.cn/uploadtest/uploadTest.php";

    private byte[] result121212;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        ByteArrayOutputStream outputStream =
                new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,
                100, outputStream);
        result121212 = outputStream.toByteArray();

        testBtn = (Button) findViewById(R.id.test);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              new MyUpTask().execute();
            }
        });






    }

    private void getTest(){
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(myUrl).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override public void onFailure(Call call, IOException e) {

            }

            @Override public void onResponse(Call call, Response response) throws IOException {

                String result = response.body().string();
                Gson gson = new Gson();

                ContentBean contentBean = gson.fromJson(result,ContentBean.class);

                Log.d("MainActivity", contentBean.getEvents().size() + "");

            }
        });
    }


    private void postImageTest(byte[] result){
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), result);
        Request request = new Request.Builder().url(actionUrl2)
                .post(body).addHeader("Content-Type","image/png").addHeader("Content-Length",String.valueOf(result.length) ).build();


        try (Response response = client.newCall(request).execute()) {
            Log.d("MainActivity", response.body().string());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }

    private void uploadFile(String uploadUrl) {
        String end = "\r\n";
        String twoHyphens = "--";
        String boundary = "******";
        try {
            URL url = new URL(uploadUrl);
            Log.d("MainActivity", "url:" + url);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url
                    .openConnection();

            // 设置每次传输的流大小，可以有效防止手机因为内存不足崩溃
            // 此方法用于在预先不知道内容长度时启用没有进行内部缓冲的 HTTP 请求正文的流。
//            httpURLConnection.setChunkedStreamingMode(128 * 1024);// 128K
            // 允许输入输出流
//            httpURLConnection.setDoInput(true);
//            httpURLConnection.setDoOutput(true);
//            httpURLConnection.setUseCaches(false);
            // 使用POST方法
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Type",
                    "multipart/form-data;boundary=" + boundary);

            DataOutputStream dos = new DataOutputStream(
                    httpURLConnection.getOutputStream());
            dos.writeBytes(twoHyphens + boundary + end);
            dos.writeBytes("Content-Disposition: form-data; name=\"uploadFile\"; filename=\""
                    + srcPath.substring(srcPath.lastIndexOf("/") + 1)
                    + "\""
                    + end);
            dos.writeBytes("Content-Type:image/jpg" + end);
            dos.writeBytes(end);


            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.bb);
            ByteArrayOutputStream outputStream =
                    new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG,
                    100, outputStream);
             byte[] result = outputStream.toByteArray();


            ByteArrayInputStream inputStream = new ByteArrayInputStream(result);

//
//            FileInputStream fis = new FileInputStream(srcPath);
//            byte[] buffer = new byte[8192]; // 8k
            int count = 0;
            // 读取文件
            while ((count = inputStream.read(result)) != -1) {
                dos.write(result, 0, count);
            }
            inputStream.close();

            dos.writeBytes(end);
            dos.writeBytes(twoHyphens + boundary + twoHyphens + end);
            dos.flush();

            InputStream is = httpURLConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            String result1 = new String();
            while ((line = br.readLine()) != null) {
                result1 += line;
            }

            Log.d("MainActivity","---->" +  result1);
            dos.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
            setTitle(e.getMessage());
        }
    }



    class MyUpTask extends AsyncTask<Void, Void, String>{

        @Override
        protected String doInBackground(Void... params) {

            postImageTest(result121212);


            return "完成";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d("MyUpTask", s);
        }
    }


}

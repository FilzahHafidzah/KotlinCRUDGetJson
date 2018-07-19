package com.filzah.kotlinrestorancrud

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.filzah.kotlinrestorancrud.server.ConfigServer
import kotlinx.android.synthetic.main.activity_plus.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response

class PlusActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_plus)
//    }
//
//    //ini add main menu to tn in toolbar
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
//        return true
//    }
//
//    //untuk func tn in toolbar
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        //get id of tn
//        when(item?.itemId){
//            R.id.insert -> insertServer()
//        }
//        return super.onOptionsItemSelected(item)
//    }
//
//
//    private fun insertServer() {
//         //taking user input
//         val et_Name = ednama.text.toString()
//         val et_Alamat = edalamat.text.toString()
////        val et_Restoran = edrestoran.text.toString()
//
//        //check user input
//        if (et_Name == "" && et_Alamat == ""){
//            toast("May not blank")
//        }else{
//            //insert server
//
//            //call ConfigServer(url link) and service (ApiService)
//            val config = ConfigServer().service
//
//            //new var, call config, and also call the edittext
//            val request = config.requestProfile()
//
//            //
//            request.enqueue(object : retrofit2.Callback<ResponJson>{
//                override fun onFailure(call: Call<ResponJson>?, t: Throwable?) {
//                    toast(t.toString())
//                }
//
//                override fun onResponse(call: Call<ResponJson>?, response: Response<ResponJson>?) {
//                    //eksekusi response
//
//                    //nullsave (?) mencegah terjadinya nullpointer exceptio
//                    if(response?.isSuccessful!!){
//
//                        val status = response.body()?.status
//                        //val pesan = response.body()?.pesan
//
//                        if (status == "nama") {
//                            //klo dia statusnya 1(success) move to MainActivity
//                            startActivity(Intent(this@PlusActivity, MainActivity::class.java))
//                        }else {
//                            toast(status!!)
//                        }
//                    }
//                }
//            })
//
//        }
//    }
}

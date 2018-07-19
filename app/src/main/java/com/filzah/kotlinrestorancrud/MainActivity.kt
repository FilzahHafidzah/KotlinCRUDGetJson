package com.filzah.kotlinrestorancrud

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.filzah.kotlinrestorancrud.adapter.MakananAdapter
import com.filzah.kotlinrestorancrud.response.ResponOwner
import com.filzah.kotlinrestorancrud.server.ConfigServer
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //taking data
        takingData()
    }

    private fun takingData() {
        ConfigServer().service.requestOwner().enqueue(object : Callback<List<ResponOwner>>{
            override fun onFailure(call: Call<List<ResponOwner>>?, t: Throwable?) {
                //toast
            }

            override fun onResponse(call: Call<List<ResponOwner>>?, response: Response<List<ResponOwner>>?) {

                if (response?.isSuccessful!!){

                    val id = response.body()
                    val url = response.body()


                    val data = response.body()

                    val adapter = MakananAdapter(data)//null savenya pake !! karena datanya more than 1

                    //

                    //set recyclerview to adapter
                    recyclerview.adapter = adapter
                    recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)

                    //Log.d("data json makan")
                }
            }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuact, menu)
        return true
    }

    //untuk func tn in toolbar
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.plus -> startActivity(Intent(this, PlusActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }
}

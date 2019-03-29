package woo.myapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import woo.myapp.databinding.ActivityTestBinding

/**
 * Created by Wooram2 on 2019. 3. 29..
 */

class TestActivity : AppCompatActivity() {

    lateinit var testBinding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testBinding = DataBindingUtil.setContentView(this, R.layout.activity_test)
    }
}
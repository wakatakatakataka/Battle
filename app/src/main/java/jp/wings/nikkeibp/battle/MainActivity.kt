package jp.wings.nikkeibp.battle

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceManager
import jp.wings.nikkeibp.battle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.flame.setOnClickListener { onBattleButtonTapped(it) }
        binding.water.setOnClickListener { onBattleButtonTapped(it) }
        binding.grass.setOnClickListener { onBattleButtonTapped(it) }

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit {
            clear()
        }
    }



    fun onBattleButtonTapped(view: View?) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}
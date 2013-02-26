package vincentxue.info.soundboard.bonta;

import java.io.IOException;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloAndroidActivity extends Activity {
  
  private static String TAG = "soundboard.bonta";
  
  static MediaPlayer mMediaPlayer = null;
  
  /**
   * Called when the activity is first created.
   * 
   * @param savedInstanceState
   *          If the activity is being re-initialized after previously being
   *          shut down then this Bundle contains the data it most recently
   *          supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is
   *          null.</b>
   */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "onCreate");
    setContentView(R.layout.main);
    setVolumeControlStream(AudioManager.STREAM_MUSIC);
    
    final MediaPlayer angrywav = MediaPlayer.create(this, R.raw.angry);
    final MediaPlayer confusedwav = MediaPlayer.create(this, R.raw.confused);
    final MediaPlayer fumowav = MediaPlayer.create(this, R.raw.fumo);
    final MediaPlayer huhwav = MediaPlayer.create(this, R.raw.huh);
    final MediaPlayer iunderstandwav = MediaPlayer.create(this,
        R.raw.iunderstand);
    final MediaPlayer marchingwav = MediaPlayer.create(this, R.raw.marching);
    final MediaPlayer marchingresponsewav = MediaPlayer.create(this,
        R.raw.marchingresponse);
    final MediaPlayer ofcoursewav = MediaPlayer.create(this, R.raw.ofcourse);
    final MediaPlayer ofcourse2wav = MediaPlayer.create(this, R.raw.ofcourse2);
    final MediaPlayer squishwav = MediaPlayer.create(this, R.raw.squish);
    final MediaPlayer talkingwav = MediaPlayer.create(this, R.raw.talking);
    final MediaPlayer thinkingwav = MediaPlayer.create(this, R.raw.thinking);
    final MediaPlayer veryangrywav = MediaPlayer.create(this, R.raw.veryangry);
    final MediaPlayer whatwav = MediaPlayer.create(this, R.raw.what);
    final MediaPlayer yeahwav = MediaPlayer.create(this, R.raw.yeah);
    final MediaPlayer yeswav = MediaPlayer.create(this, R.raw.yes);
    
    Button angry = (Button) findViewById(R.id.angry);
    angry.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          angrywav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        angrywav.start();
      }
      
    });
    registerForContextMenu(angry);
    
    Button veryangry = (Button) findViewById(R.id.veryangry);
    veryangry.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          veryangrywav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        veryangrywav.start();
      }
      
    });
    registerForContextMenu(veryangry);
    
    Button confused = (Button) findViewById(R.id.confused);
    confused.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          confusedwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        confusedwav.start();
      }
      
    });
    registerForContextMenu(confused);
    
    Button huh = (Button) findViewById(R.id.huh);
    huh.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          huhwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        huhwav.start();
      }
      
    });
    registerForContextMenu(huh);
    
    Button thinking = (Button) findViewById(R.id.thinking);
    thinking.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          thinkingwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        thinkingwav.start();
      }
      
    });
    registerForContextMenu(thinking);
    
    Button what = (Button) findViewById(R.id.what);
    what.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          whatwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        whatwav.start();
      }
      
    });
    registerForContextMenu(what);
    
    Button iunderstand = (Button) findViewById(R.id.iunderstand);
    iunderstand.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          iunderstandwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        iunderstandwav.start();
      }
      
    });
    registerForContextMenu(iunderstand);
    
    Button ofcourse = (Button) findViewById(R.id.ofcourse);
    ofcourse.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          ofcoursewav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        ofcoursewav.start();
      }
      
    });
    registerForContextMenu(ofcourse);
    
    Button ofcourse2 = (Button) findViewById(R.id.ofcourse2);
    ofcourse2.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          ofcourse2wav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        ofcourse2wav.start();
      }
      
    });
    registerForContextMenu(ofcourse2);
    
    Button yeah = (Button) findViewById(R.id.yeah);
    yeah.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          yeahwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        yeahwav.start();
      }
      
    });
    registerForContextMenu(yeah);
    
    Button talking = (Button) findViewById(R.id.talking);
    talking.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          talkingwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        talkingwav.start();
      }
      
    });
    registerForContextMenu(yeah);
    
    Button yes = (Button) findViewById(R.id.yes);
    yes.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          yeswav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        yeswav.start();
      }
      
    });
    registerForContextMenu(yes);
    
    Button fumo = (Button) findViewById(R.id.fumo);
    fumo.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          fumowav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        fumowav.start();
      }
      
    });
    registerForContextMenu(fumo);
    
    Button marching = (Button) findViewById(R.id.marching);
    marching.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          marchingwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        marchingwav.start();
      }
      
    });
    registerForContextMenu(marching);
    
    Button marchingresponse = (Button) findViewById(R.id.marchingresponse);
    marchingresponse.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          marchingresponsewav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        marchingresponsewav.start();
      }
      
    });
    registerForContextMenu(marchingresponse);
    
    Button squish = (Button) findViewById(R.id.squish);
    squish.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        try {
          squishwav.prepare();
        } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        squishwav.start();
      }
      
    });
    registerForContextMenu(squish);
    
  }
}

package com.example.a30daysofdancing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(createTips())
    }

    private fun createTips(): List<Tip> {
        return listOf(
            Tip(1, "Stand with feet shoulder-width apart and knees slightly bent.", R.drawable.image1),
            Tip(2, "Keep your head level and shoulders relaxed.", R.drawable.image2),
            Tip(3, "Practice basic foot movements like heel-toe taps and shuffles.", R.drawable.image3),
            Tip(4, "Focus on weight transfer between feet.", R.drawable.image4),
            Tip(5, "Do simple arm waves and hip swivels.", R.drawable.image5),
            Tip(6, "Work on isolating legs separately.", R.drawable.image6),
            Tip(7, "Learn basic rhythmic patterns (e.g., 1-2-3).", R.drawable.image7),
            Tip(8, "Practice tapping feet or hands to internalize rhythms.", R.drawable.image8),
            Tip(9, "Focus on timing and coordination.", R.drawable.image9),
            Tip(10, "Try simple footwork patterns like chasse or brush.", R.drawable.image10),
            Tip(11, "Learn simple steps for popular styles (e.g., waltz, swing, salsa).", R.drawable.image11),
            Tip(12, "Practice these steps slowly and focus on proper technique.", R.drawable.image12),
            Tip(13, "Work on executing steps smoothly between counts.", R.drawable.image13),
            Tip(14, "Incorporate turns and changes of direction.", R.drawable.image14),
            Tip(15, "Listen to dance music and try to feel the rhythm.", R.drawable.image15),
            Tip(16, "Practice moving freely to the beat.", R.drawable.image16),
            Tip(17, "Experiment with expression through facial expressions and body language.", R.drawable.image17),
            Tip(18, "Start incorporating small gestures and movements.", R.drawable.image18),
            Tip(19, "Create short combinations using learned steps and movements.", R.drawable.image19),
            Tip(20, "Practice in front of a mirror to check posture and alignment.", R.drawable.image20),
            Tip(21, "Record yourself to analyze technique and progress.", R.drawable.image21),
            Tip(22, "Dance to your favorite songs and enjoy the process!", R.drawable.image22),
            Tip(23, "Focus on breath control during movement.", R.drawable.image23),
            Tip(24, "Work on transitions between different dance styles.", R.drawable.image24),
            Tip(25, "Learn basic turns and practice balancing.", R.drawable.image25),
            Tip(26, "Incorporate music into your practice sessions.", R.drawable.image26),
            Tip(27, "Experiment with different types of music genres.", R.drawable.image27),
            Tip(28, "Practice dancing with a partner.", R.drawable.image28),
            Tip(29, "Try attending on different dance classes near your area.", R.drawable.image29),
            Tip(30, "Set achievable goals for your dance journey.", R.drawable.image30),
        )
    }
}
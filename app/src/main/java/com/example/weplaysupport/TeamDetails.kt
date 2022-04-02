package com.example.weplaysupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TeamDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_profile)
        val bundle: Bundle? = intent.extras
        val member = bundle!!.get("member") as TeamMember

        findViewById<TextView>(R.id.team_username).text = member.name
        findViewById<Button>(R.id.team_email_button).text = member.email
        findViewById<Button>(R.id.team_phone_button).text = member.phone
        findViewById<Button>(R.id.team_site_button).text = if (member.website == "") {
            "no site"
        } else {
            member.website
        }
        findViewById<TextView>(R.id.team_position_1_text).text = if (member.position.isNotEmpty()) {
            member.position[0]
        } else {
            "No Position"
        }
        findViewById<TextView>(R.id.team_position_2_text).text = if (member.position.size >=2) {
            member.position[1]
        } else {
            "No Position"
        }
        findViewById<TextView>(R.id.team_position_3_text).text = if (member.position.size >=3) {
            member.position[2]
        } else {
            "No Position"
        }

        findViewById<TextView>(R.id.member_feild_of_experience).text = if (member.fields_of_expertise!="") {
            member.fields_of_expertise
        } else {
            "No Experience"
        }
        findViewById<TextView>(R.id.member_bio).text = if (member.bio!="") {
            member.bio
        } else {
            "No Bio"
        }
    }
}
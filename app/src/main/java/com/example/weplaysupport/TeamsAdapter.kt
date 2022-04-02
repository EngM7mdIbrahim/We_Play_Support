package com.example.weplaysupport

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import java.io.Serializable

class TeamsAdapter(val context: Context, val members: List<TeamMember> ): RecyclerView.Adapter<TeamsAdapter.TeamMemberVideHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamMemberVideHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.member_card_view,parent,false)
        val holder = TeamMemberVideHolder(view)
        return TeamMemberVideHolder(view)
    }

    override fun onBindViewHolder(holder: TeamMemberVideHolder, position: Int) {
        val teamMember = members[position]
        holder.setData(teamMember,position,context)
        holder.initateClickListener(context)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    inner class TeamMemberVideHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentMember: TeamMember? = null
        var currentPosition: Int = 0

        init {


        }
        fun setData(member: TeamMember?, pos: Int, context: Context) {
            member?.let {
                itemView.findViewById<TextView>(R.id.user_name).text  = member.name
                itemView.findViewById<TextView>(R.id.team_position_text).text = member.position[0]
                itemView.findViewById<TextView>(R.id.team_office_text).text = member.office
                itemView.findViewById<Button>(R.id.team_email_button).text = member.email
                itemView.findViewById<Button>(R.id.team_phone_button).text = member.phone
                var j: Int = context.resources.getIdentifier("team"+pos+".jpg","imageView", context.packageName)
                itemView.findViewById<CircleImageView>(R.id.profile_image).setImageResource(j)
            }

            this.currentMember = member
            this.currentPosition = pos
        }
        fun initateClickListener(context: Context){
            itemView.setOnClickListener {
                val intent = Intent(context, TeamDetails::class.java)
                intent.putExtra("member", this.currentMember as Serializable)
                context.startActivity(intent)
            }
        }

    }
}
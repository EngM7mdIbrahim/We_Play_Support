package com.example.weplaysupport

import java.io.Serializable


data class TeamMember(var name: String,
                      var imageUrl: String,
                      var office: String,
                var email: String,
                var phone: String,
                var position: Array<String>,
                var website: String,
                var fields_of_expertise: String,
                var bio: String) : Serializable{

}

object Suppiler{
    val teamMembers = listOf<TeamMember>(
        TeamMember("Pierre Dillenbourg","","RLC D1 740","pierre.dillenbourg@epfl.ch", "+41 21 693 20 71",
            arrayOf<String>("Full Professor","Manager","Associate Vice President for Education"),"https://www.epfl.ch/labs/chili/",
            "Computer-supported collaborative learning & work, Learning technologies, MOOCs Human-computer interaction, Educational Robotics, Eye Tracking, Tangible Interfaces, AR & VR, vocational education",
            "A former teacher in elementary school, Pierre Dillenbourg graduated in educational science (University of Mons, Belgium). " +
                    "He started his research on learning technologies in 1984. In 1986, he has been on of the first in the world to apply machine learning to develop " +
                    "a self-improving teaching system. He obtained a PhD in computer science from the University of Lancaster (UK), in the domain of artificial intelligence " +
                    "applications for education. He has been assistant professor at the University of Geneva. He joined EPFL in 2002. He has been the director of Center for " +
                    "Research and Support on Learning and its Technologies, then academic director of Center for Digital Education, which implements the MOOC strategy of EPFL " +
                    "(over w million registrations). He is full professor in learning technologies in the School of Computer & Communication Sciences, where he is the head of " +
                    "the CHILI Lab: \"Computer-Human Interaction for Learning & Instruction ». He is the director of the leading house DUAL-T, which develops technologies for " +
                    "dual vocational education systems (carpenters, florists,...). With EPFL colleagues, he launched in 2017 the Swiss EdTech Collider, an incubator with 80 start-ups " +
                    "in learning technologies. He (co-)-founded 5 start-ups, does consulting missions in the corporate world and joined the board of several companies or institutions. " +
                    "In 2018, he co-founded LEARN, the EPFL Center of Learning Sciences that brings together the local initiatives in educational innovation. " +
                    "He is a fellow of the International Society for Learning Sciences. " +
                    "He currently is the Associate Vice-President for Education at EPFL."),
        TeamMember("Florence Colomb","","RLC D1 470","florence.colomb@epfl.ch", "+41 21 693 22 75",
            arrayOf<String>("Secretary","Secretary"),"",
            "Moodle Baking","")
    )

}
package com.sanika.manavtauser

import com.google.firebase.auth.FirebaseAuth




class experiment {

    fun signOut() {
        // [START auth_sign_out]
        FirebaseAuth.getInstance().signOut()
        // [END auth_sign_out]
    }
}
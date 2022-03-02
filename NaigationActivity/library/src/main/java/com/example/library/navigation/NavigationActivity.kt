package com.example.library.navigation

import androidx.appcompat.widget.Toolbar
import androidx.databinding.ViewDataBinding
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.library.binding.BindingActivity

open class NavigationActivity<VB: ViewDataBinding>(private val layoutId: Int, private val navHostId: Int) : BindingActivity<VB>(layoutId){
    private val navController by lazy { (supportFragmentManager.findFragmentById(navHostId) as NavHostFragment).navController}
    private val appBarConfiguration by lazy { AppBarConfiguration(navController.graph)}

    override fun setSupportActionBar(toolbar: Toolbar?) {
        super.setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || navController.navigateUp(appBarConfiguration)
    }

    override fun finish() {
        super.finish()
        ActivityNavigator.applyPopAnimationsToPendingTransition(this)
    }

}
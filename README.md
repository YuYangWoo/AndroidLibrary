# AndroidLibrary
안드로이드 라이브러리를 테스트하면서 개발

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
 
 Step 2. Add the dependency
 
 	dependencies {
	        implementation 'com.github.YuYangWoo:AndroidLibrary:1.1'
	}

# Before

 class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment).navController
    }

    private val appBarConfiguration by lazy {
        AppBarConfiguration(
            setOf(R.id.mainFragment)
        )
    }

    override fun init() {
        super.init()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}

	
# After
	
 class MainActivity : NavigationActivity<ActivityMainBinding>(R.layout.activity_main, R.id.fragmentContainerView) {

}

	
# Before


class MainFragment : Fragment() {
    private lateinit var binding: ViewDataBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        // TODO YOUR JOB
        init()
        return binding.root
    }

    protected open fun init() {

    }
}
	
# After

class MainFragment : BindingFragment<FragmentMainBinding>(R.layout.fragment_main) {
    override fun init() {
        super.init()
        // TODO
    }
}

If you use DialogFragment, use BindingDialogFragment!  
You can use that like BindingFragment!  
It's too Simple!  

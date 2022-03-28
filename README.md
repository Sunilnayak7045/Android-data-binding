# Android-data-binding


android {

    .
    .
    
    buildFeatures {
        dataBinding true
    }
}
-----------------------------------------------------------
To bind the data with views

any changes in data, then views will get automatically updated

---------------------------------------------------------
<data>
    
        <variable
            name="quote"
            type="com.example.databinding.Quotes" />
    
</data>

variable of name quote of type Quotes class i.e data class

---------------------------------------------------------
 <TextView
           
           .
           .
            android:text="@{quote.author}"
  />

variable(quote) are used to bind the views
---------------------------------------------------------

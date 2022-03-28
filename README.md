# Android-data-binding


android {
    ...
    buildFeatures {
        dataBinding true
    }
}
-----------------------------------------------------------
data ko views ke saath bind karna

data me kabhi bhi change hoga, views apne aap update ho jaayega

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

variable use karenge to bind the views
---------------------------------------------------------

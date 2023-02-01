import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private EditText inputField;
  private Button submitButton;
  private TextView resultView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    inputField = findViewById(R.id.input_field);
    submitButton = findViewById(R.id.submit_button);
    resultView = findViewById(R.id.result_view);

    submitButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String input = inputField.getText().toString();
        resultView.setText(input);
      }
    });
  }
}

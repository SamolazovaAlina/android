package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary());


    }

    /**
     * Calculates the price of the order.
     *
     *
     */
    private int calculatePrice() {

        int price = quantity * 5;
        return price;
    }

    private String createOrderSummary() {

        String name = "Ruha Sima";
        return  "Name: "+ name+"\n"+"Quantity: "+quantity+"\n"+"Total: $"+calculatePrice()+"\n"+ "Thank you!";
    }

    public void increment(View view) {

        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view) {
        quantity=quantity-1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    private void onCheckboxClicked() {

    }
}


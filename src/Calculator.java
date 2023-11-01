import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JLabel lbl ;
    JButton SevenBtn,EightBtn,NineBtn,FourBtn,FiveBtn,SixBtn,ThreeBtn,TwoBtn,OneBtn;
    JButton XBtn,ZeroBtn,MinusBtn,AddBtn,EqualBtn,DotBtn,DivBtn,ClearBtn;
    Boolean isOperaterClicked = false;
    Boolean isAddOperatorClicked = false;
    Boolean isSubOperatorClicked = false;
    Boolean isMulOperatorClicked = false;
    Boolean isDivOperatorClicked = false;
    String oldValue, newValue;
    Float oldValueF, newValueF;
    Float result;

    public Calculator(){
        JFrame f = new JFrame("CALC");
        f.setLayout(null);
        f.setSize(440,670);
        f.setVisible(true);
        f.setLocation(500,100);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);



        lbl = new JLabel();
        lbl.setBounds(30,30,380,70);
        lbl.setForeground(Color.white);
        lbl.setBackground(Color.BLACK);
        lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl.setOpaque(true);


        SevenBtn = new JButton("7");
        SevenBtn.setBounds(30,230,80,80);
        SevenBtn.addActionListener(this);
        f.add(SevenBtn);

         EightBtn = new JButton("8");
        EightBtn.setBounds(130,230,80,80);
        EightBtn.addActionListener(this);
        f.add(EightBtn);

        NineBtn = new JButton("9");
        NineBtn.setBounds(230,230,80,80);
        NineBtn.addActionListener(this);
        f.add(NineBtn);

        FourBtn = new JButton("4");
        FourBtn.setBounds(30,330,80,80);
        FourBtn.addActionListener(this);
        f.add(FourBtn);

        FiveBtn = new JButton("5");
        FiveBtn.setBounds(130,330,80,80);
        FiveBtn.addActionListener(this);
        f.add(FiveBtn);

        SixBtn = new JButton("6");
        SixBtn.setBounds(230,330,80,80);
        SixBtn.addActionListener(this);
        f.add(SixBtn);

        ThreeBtn = new JButton("3");
        ThreeBtn.setBounds(30,430,80,80);
        ThreeBtn.addActionListener(this);
        f.add(ThreeBtn);

        TwoBtn = new JButton("2");
        TwoBtn.setBounds(130,430,80,80);
        TwoBtn.addActionListener(this);
        f.add(TwoBtn);

        OneBtn = new JButton("1");
        OneBtn.setBounds(230,430,80,80);
        OneBtn.addActionListener(this);
        f.add(OneBtn);

        XBtn = new JButton("X");
        XBtn.setBounds(330,230,80,80);
        XBtn.addActionListener(this);
        f.add(XBtn);

        MinusBtn = new JButton("-");
        MinusBtn.setBounds(330,330,80,80);
        MinusBtn.addActionListener(this);
        f.add(MinusBtn);

        AddBtn = new JButton("+");
        AddBtn.setBounds(330,430,80,80);
        AddBtn.addActionListener(this);
        f.add(AddBtn);

        EqualBtn = new JButton("=");
        EqualBtn.setBounds(330,530,80,80);
        EqualBtn.addActionListener(this);
        f.add(EqualBtn);

        DotBtn = new JButton(".");
        DotBtn.setBounds(230,530,80,80);
        DotBtn.addActionListener(this);
        f.add(DotBtn);

        ZeroBtn = new JButton("0");
        ZeroBtn.setBounds(30,530,80,80);
        ZeroBtn.addActionListener(this);
        f.add(ZeroBtn);

        DivBtn = new JButton("/");
        DivBtn.setBounds(130,530,80,80);
        DivBtn.addActionListener(this);
        f.add(DivBtn);

        ClearBtn = new JButton("Clear");
        ClearBtn.setBounds(30,130,80,80);
        ClearBtn.addActionListener(this);
        f.add(ClearBtn);

        f.add(lbl);

    }
    public static void main(String[] args){

        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SevenBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("7");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "7");
            }

        } else if (e.getSource() == EightBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("8");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "8");
            }

        } else if (e.getSource() == NineBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("9");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "9");
            }

        } else if (e.getSource() == FourBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("4");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "4");
            }
        } else if (e.getSource() == FiveBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("5");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "5");
            }

        } else if (e.getSource() == SixBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("6");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "6");
            }

        } else if (e.getSource() == OneBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("1");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "1");
            }

        } else if (e.getSource() == TwoBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("2");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "2");
            }

        } else if (e.getSource() == ThreeBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("3");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "3");
            }

        } else if (e.getSource() == ZeroBtn) {
            if (isOperaterClicked.equals(true)) {
                lbl.setText("0");
                isOperaterClicked = false;
            } else {
                lbl.setText(lbl.getText() + "0");
            }

        } else if (e.getSource() == XBtn) {

            isOperaterClicked = true;
            isMulOperatorClicked = true;
            oldValue = lbl.getText();
            oldValueF = Float.parseFloat(oldValue);
            lbl.setText("X");

        } else if (e.getSource() == MinusBtn) {

            isOperaterClicked = true;
            isSubOperatorClicked = true;
            oldValue = lbl.getText();
            oldValueF = Float.parseFloat(oldValue);
            lbl.setText("-");

        } else if (e.getSource() == AddBtn) {

            isOperaterClicked = true;
            isAddOperatorClicked = true;
            oldValue = lbl.getText();
            oldValueF = Float.parseFloat(oldValue);
            lbl.setText("+");

        } else if (e.getSource() == DotBtn) {

            if(isOperaterClicked.equals(true)) {
                lbl.setText(".");
                isOperaterClicked = false;
            }else{
                lbl.setText(lbl.getText() + ".");
            }

        } else if (e.getSource() == DivBtn) {

            isOperaterClicked = true;
            isDivOperatorClicked = true;
            oldValue = lbl.getText();
            oldValueF = Float.parseFloat(oldValue);
            lbl.setText("/");

        } else if (e.getSource() == EqualBtn) {

            newValue = lbl.getText();
            newValueF = Float.parseFloat(newValue);
            if (isAddOperatorClicked) {
                result = oldValueF + newValueF;
                isAddOperatorClicked = false;

            }else if(isSubOperatorClicked) {
                result =oldValueF - newValueF;
                isSubOperatorClicked = false;

            }else if(isDivOperatorClicked){
                result = oldValueF / newValueF;
                isDivOperatorClicked = false;

            }else if(isMulOperatorClicked){
                result = oldValueF * newValueF;
                isMulOperatorClicked = false;
            }
            lbl.setText(result + "");
        }
        else { lbl.setText(""); }
    }}

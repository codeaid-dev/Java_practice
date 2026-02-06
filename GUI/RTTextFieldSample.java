import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class RTTextFieldSample extends JFrame {
    public RTTextFieldSample() {
        setTitle("テキスト入力リアルタイム取得サンプル");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        // --- 入力欄 ---
        JTextField textField = new JTextField(20);
        JTextArea textArea = new JTextArea(5, 20);

        // --- 出力欄 ---
        JLabel fieldOutput = new JLabel("JTextFieldの入力内容がここに表示されます");
        JLabel areaOutput = new JLabel("JTextAreaの入力内容がここに表示されます");

        // JTextField のリアルタイム取得
        textField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { update(); }
            public void removeUpdate(DocumentEvent e) { update(); }
            public void changedUpdate(DocumentEvent e) { update(); }
            private void update() {
                fieldOutput.setText("JTextField: " + textField.getText());
            }
        });

        // JTextArea のリアルタイム取得
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { update(); }
            public void removeUpdate(DocumentEvent e) { update(); }
            public void changedUpdate(DocumentEvent e) { update(); }
            private void update() {
                // 複数行を表示するときは改行を置換して表示
                areaOutput.setText("JTextArea: " + textArea.getText().replace("\n", "\\n"));
                // areaOutput.setText("<html>JTextArea: " + textArea.getText().replace("\n", "<br>") + "</html>");
            }
        });

        // --- コンポーネントを追加 ---
        add(new JLabel("JTextField:"));
        add(textField);
        add(fieldOutput);

        add(new JLabel("JTextArea:"));
        add(new JScrollPane(textArea));
        add(areaOutput);

        setVisible(true);
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(RTTextFieldSample::new);
        new RTTextFieldSample();
    }
}

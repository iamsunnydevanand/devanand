import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class sunny
  {
    String school[]=new String[10];
    int counter=0;
    String y1;
    String addio;
    String total;
    String addp;
    String y7;
    int mult;
   
    int hdf;
   


    sunny()
    {

        JFrame j;
        j=new JFrame();
        
        
        j.setTitle("Calculator");
        
        
        
        
        final TextField dev=new TextField();
        dev.setBounds(30,30,280,100);
        
        
        
        
        
        JButton b=new JButton("1");
        JButton c=new JButton("2");
        JButton e=new JButton("3");
        JButton f=new JButton("%");
        JButton g=new JButton("4");
        JButton h=new JButton("5");
        JButton i=new JButton("6");
        JButton k=new JButton("*");
        JButton u=new JButton("7");
        JButton r=new JButton("8");
        JButton t=new JButton("9");
        JButton q=new JButton("-");
        JButton v=new JButton("+");
        JButton x=new JButton("0");
        JButton z=new JButton("=");
        JButton la=new JButton(".");
        
        
        
        
        
        b.setBounds(0,200,80,70);
        c.setBounds(80,200,80,70);
        e.setBounds(160,200,80,70);
        f.setBounds(240,200,80,70);
        g.setBounds(0,270,80,70);
        h.setBounds(80,270,80,70);
        i.setBounds(160,270,80,70);
        k.setBounds(240,270,80,70);
        u.setBounds(0,340,80,70);
        r.setBounds(80,340,80,70);
        t.setBounds(160,340,80,70);
        q.setBounds(240,340,80,70);
        v.setBounds(0,410,80,70);
        x.setBounds(80,410,80,70);
        z.setBounds(240,410,80,70);
        la.setBounds(160,410,80,70);
        
        
        
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String ujdh=dev.getText()+e.getActionCommand();
        
        dev.setText(ujdh);
        
        
            }
        });
        
        
        
        c.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String sdhd=dev.getText()+e.getActionCommand();
        
        
        dev.setText(sdhd);
        
            }
        });
        
        e.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String sdhgd=dev.getText()+e.getActionCommand();
        
        
        dev.setText(sdhgd);
        
            }
        });
        f.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
      String kl90=dev.getText();
      school[0]=kl90;
      dev.setText("");


      z.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent e)
        {
    
    
   String  y7=dev.getText();
    school[1]=y7;
    


        int abc=Integer.parseInt(school[0]);
        int xyz=Integer.parseInt(school[1]);
        int total=abc/xyz;
        int mult=abc*xyz;
        String mul8=Integer.toString(mult);
        String addp=Integer.toString(total);

       String abcc=Integer.toString(abc);
       String xyzz=Integer.toString(xyz);
      dev.setText(addp);
     
     
    }
    });
        
            }
        });
        
        g.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String sdhgdj=dev.getText()+e.getActionCommand();
        
        
        dev.setText(sdhgdj);
        
            }
        });
        
        
        h.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String sdhgdo=dev.getText()+e.getActionCommand();
        
        
        dev.setText(sdhgdo);
        
            }
        });
        
        i.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String sdhgdoi=dev.getText()+e.getActionCommand();
        
        
        dev.setText(sdhgdoi);
        
            }
        });
        
        k.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        
        String mul=dev.getText();
        school[0]= mul;
        dev.setText("");   
     
        z.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        
         y7=dev.getText();
        school[1]=y7;

            int abc=Integer.parseInt(school[0]);
            int xyz=Integer.parseInt(school[1]);
            int total=abc+xyz;
            int mult=abc*xyz;
            String mul8=Integer.toString(mult);
            String addp=Integer.toString(total);

           String abcc=Integer.toString(abc);
           String xyzz=Integer.toString(xyz);
           dev.setText(mul8);
         
         
        }
        });
        
        
            }
        });
        
        u.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String stryr=dev.getText()+e.getActionCommand();
        
        
        dev.setText(stryr);
        
            }
        });
        
        
        r.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String strfyr=dev.getText()+e.getActionCommand();
        
        
        dev.setText(strfyr);
        
            }
        });
        t.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String strrfyr=dev.getText()+e.getActionCommand();
        
        
        dev.setText(strrfyr);
        
            }
        });
        
        q.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String m9=dev.getText();
        school[0]=m9;
        dev.setText("");
        
        z.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        
         y7=dev.getText();
        school[1]=y7;

            int abc=Integer.parseInt(school[0]);
            int xyz=Integer.parseInt(school[1]);
            int total=abc-xyz;
            int mult=abc*xyz;
            String mul8=Integer.toString(mult);
            String addp=Integer.toString(total);

           String abcc=Integer.toString(abc);
           String xyzz=Integer.toString(xyz);
          dev.setText(addp);
         
         
        }
        });

        
        
  
        
            }
        });
        
        x.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String strfyrxx=dev.getText()+e.getActionCommand();
        
        
        dev.setText(strfyrxx);
        
            }
        });
        
       
        
        v.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
       y1=dev.getText();
         school[0]=y1;
         dev.setText("");

         
         z.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        
         y7=dev.getText();
        school[1]=y7;

            int abc=Integer.parseInt(school[0]);
            int xyz=Integer.parseInt(school[1]);
            int total=abc+xyz;
            int mult=abc*xyz;
            String mul8=Integer.toString(mult);
            String addp=Integer.toString(total);

           String abcc=Integer.toString(abc);
           String xyzz=Integer.toString(xyz);
          dev.setText(addp);
         
         
        }
        });
         
     

        
        
       

       
        
        
        
        
            }
        });
        
        la.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
        
        String strfyrla=dev.getText()+e.getActionCommand();
        
        
        dev.setText(strfyrla);
        
            }
        });


    
        
        
        
        j.add(b);
        j.add(c);
        j.add(e);
        j.add(f);
        j.add(g);
        j.add(h);
        j.add(i);
        j.add(k);
        j.add(u);
        j.add(r);
        j.add(t);
        j.add(q);
        j.add(v);
        j.add(x);
        j.add(z);
        j.add(la);
        j.add(dev);
        
        
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        j.setLayout(null);
        j.setSize(335,520);
        j.setVisible(true);
        
        

    }


   


public static void main(String[] args)
{
   
    

  
new sunny();

}


}


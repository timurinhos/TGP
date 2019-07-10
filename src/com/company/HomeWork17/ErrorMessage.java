package com.company.HomeWork17;


class Err{
    String msg;
    int severity;

     Err(String msg, int severity) {
        this.msg = msg;
        this.severity = severity;
    }
}

public class ErrorMessage {
    String msg[]={
            "Ошибка вывода",
            "Ошибка ввода",
            "нет места на диске",
            "диск не вставлен"
    };

    int[]howbad = {3,2,3,4};

    Err getErrMsg(int i) {
        if (i >= 0 && i < msg.length) {
            return new Err(msg[i], howbad[i]);
        }
//        }else {
//            return new Err("Нет такой ошибки", 0);
//        }
            //}
        return null;
        }
    }
class Runn{
    public static void main(String[] args) {
        ErrorMessage message = new ErrorMessage();

        Err err = message.getErrMsg(2);
        System.out.println(err.msg+" уровень " + err.severity);
        err = message.getErrMsg(19);
        System.out.println(err.msg+" уровень " + err.severity);


    }
}



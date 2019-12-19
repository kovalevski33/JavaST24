package by.traning.inclassroom.ruble;

import java.util.List;

public class ConsoleHelper {
    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder helper (List<Integer> list){

        if (list.size()==4){
            int a = list.get(0);
            switch (a){
                case 1: stringBuilder.append("Одна тысяча ");
                    break;
                case 2: stringBuilder.append("Две тысячи ");
                    break;
                case 3: stringBuilder.append("Три тысячи ");
                    break;
                case 4: stringBuilder.append("Четыре тысячи ");
                    break;
                case 5: stringBuilder.append("Пять тысяч ");
                    break;
                case 6: stringBuilder.append("Шесть тысяч ");
                    break;
                case 7: stringBuilder.append("Семь тысяч ");
                    break;
                case 8: stringBuilder.append("Восемь тысяч ");
                    break;
                case 9: stringBuilder.append("Девять тысяч ");
                    break;
                default:
            }
            int b = list.get(1);
            switch (b){
                case 0: break;
                case 1: stringBuilder.append("сто ");
                    break;
                case 2: stringBuilder.append("двести ");
                    break;
                case 3: stringBuilder.append("триста ");
                    break;
                case 4: stringBuilder.append("четыреста ");
                    break;
                case 5: stringBuilder.append("пятьсот ");
                    break;
                case 6: stringBuilder.append("шестьсот ");
                    break;
                case 7: stringBuilder.append("семьсот ");
                    break;
                case 8: stringBuilder.append("восемьсот ");
                    break;
                case 9: stringBuilder.append("девятьсот ");
                    break;
                default:
            }
            int c = list.get(2);
            int d = list.get(3);
            boolean isEnd=false;
            switch (c){
                case 0: break;
                case 1: if (d==0){
                    stringBuilder.append("десять ");
                }else if (d==1){
                    stringBuilder.append("одиннадцать ");
                    isEnd=true;
                } else if (d==2){
                    stringBuilder.append("двенадцать ");
                    isEnd=true;
                }else if (d==3){
                    stringBuilder.append("тринадцать ");
                    isEnd=true;
                }else if (d==4){
                    stringBuilder.append("четырнадцать ");
                    isEnd=true;
                }else if (d==5){
                    stringBuilder.append("пятнадцать ");
                    isEnd=true;
                }else if (d==6){
                    stringBuilder.append("шеснадцать ");
                    isEnd=true;
                }else if (d==7){
                    stringBuilder.append("семнадцать ");
                    isEnd=true;
                }else if (d==8){
                    stringBuilder.append("восемнадцать ");
                    isEnd=true;
                }else if (d==9){
                    stringBuilder.append("девятнадцать ");
                    isEnd=true;
                } break;
                case 2: stringBuilder.append("двадцать ");
                    break;
                case 3: stringBuilder.append("тридцать ");
                    break;
                case 4: stringBuilder.append("сорок ");
                    break;
                case 5: stringBuilder.append("пятьдесят ");
                    break;
                case 6: stringBuilder.append("шестьдесят ");
                    break;
                case 7: stringBuilder.append("семьдесят ");
                    break;
                case 8: stringBuilder.append("восемьдесят ");
                    break;
                case 9: stringBuilder.append("девяносто ");
                    break;
                default:
            }
            if (!isEnd){
                switch (d){
                    case 0: break;
                    case 1: stringBuilder.append("один ");
                        break;
                    case 2: stringBuilder.append("два ");
                        break;
                    case 3: stringBuilder.append("три ");
                        break;
                    case 4: stringBuilder.append("четыре ");
                        break;
                    case 5: stringBuilder.append("пять ");
                        break;
                    case 6: stringBuilder.append("шесть ");
                        break;
                    case 7: stringBuilder.append("семь ");
                        break;
                    case 8: stringBuilder.append("восемь ");
                        break;
                    case 9: stringBuilder.append("девять ");
                        break;
                    default:
                }
            }
            if (list.get(list.size()-1)==1 && !isEnd){
                stringBuilder.append("рубль");
            } else if (list.get(list.size()-1)>=2 && list.get(list.size()-1)<=4 && !isEnd){
                stringBuilder.append("рубля");
            } else {
                stringBuilder.append("рублей");
            }
        }

        if (list.size()==3){
            int a = list.get(0);
            switch (a){
                case 0: break;
                case 1: stringBuilder.append("Cто ");
                    break;
                case 2: stringBuilder.append("Двести ");
                    break;
                case 3: stringBuilder.append("Триста ");
                    break;
                case 4: stringBuilder.append("Четыреста ");
                    break;
                case 5: stringBuilder.append("Пятьсот ");
                    break;
                case 6: stringBuilder.append("Шестьсот ");
                    break;
                case 7: stringBuilder.append("Семьсот ");
                    break;
                case 8: stringBuilder.append("Восемьсот ");
                    break;
                case 9: stringBuilder.append("Девятьсот ");
                    break;
                default:
            }
            int c = list.get(1);
            int d = list.get(2);
            boolean isEnd=false;
            switch (c){
                case 0: break;
                case 1: if (d==0){
                    stringBuilder.append("десять ");
                }else if (d==1){
                    stringBuilder.append("одиннадцать ");
                    isEnd=true;
                } else if (d==2){
                    stringBuilder.append("двенадцать ");
                    isEnd=true;
                }else if (d==3){
                    stringBuilder.append("тринадцать ");
                    isEnd=true;
                }else if (d==4){
                    stringBuilder.append("четырнадцать ");
                    isEnd=true;
                }else if (d==5){
                    stringBuilder.append("пятнадцать ");
                    isEnd=true;
                }else if (d==6){
                    stringBuilder.append("шеснадцать ");
                    isEnd=true;
                }else if (d==7){
                    stringBuilder.append("семнадцать ");
                    isEnd=true;
                }else if (d==8){
                    stringBuilder.append("восемнадцать ");
                    isEnd=true;
                }else if (d==9){
                    stringBuilder.append("девятнадцать ");
                    isEnd=true;
                } break;
                case 2: stringBuilder.append("двадцать ");
                    break;
                case 3: stringBuilder.append("тридцать ");
                    break;
                case 4: stringBuilder.append("сорок ");
                    break;
                case 5: stringBuilder.append("пятьдесят ");
                    break;
                case 6: stringBuilder.append("шестьдесят ");
                    break;
                case 7: stringBuilder.append("семьдесят ");
                    break;
                case 8: stringBuilder.append("восемьдесят ");
                    break;
                case 9: stringBuilder.append("девяносто ");
                    break;
                default:
            }
            if (!isEnd){
                switch (d){
                    case 0: break;
                    case 1: stringBuilder.append("один ");
                        break;
                    case 2: stringBuilder.append("два ");
                        break;
                    case 3: stringBuilder.append("три ");
                        break;
                    case 4: stringBuilder.append("четыре ");
                        break;
                    case 5: stringBuilder.append("пять ");
                        break;
                    case 6: stringBuilder.append("шесть ");
                        break;
                    case 7: stringBuilder.append("семь ");
                        break;
                    case 8: stringBuilder.append("восемь ");
                        break;
                    case 9: stringBuilder.append("девять ");
                        break;
                    default:
                }
            }
            if (list.get(list.size()-1)==1 && !isEnd){
                stringBuilder.append("рубль");
            } else if (list.get(list.size()-1)>=2 && list.get(list.size()-1)<=4 && !isEnd){
                stringBuilder.append("рубля");
            } else {
                stringBuilder.append("рублей");
            }
        }

        if (list.size()==2){
            int c = list.get(0);
            int d = list.get(1);
            boolean isEnd=false;
            switch (c){
                case 0: break;
                case 1: if (d==0){
                    stringBuilder.append("Десять ");
                }else if (d==1){
                    stringBuilder.append("Одиннадцать ");
                    isEnd=true;
                } else if (d==2){
                    stringBuilder.append("Двенадцать ");
                    isEnd=true;
                }else if (d==3){
                    stringBuilder.append("Тринадцать ");
                    isEnd=true;
                }else if (d==4){
                    stringBuilder.append("Четырнадцать ");
                    isEnd=true;
                }else if (d==5){
                    stringBuilder.append("Пятнадцать ");
                    isEnd=true;
                }else if (d==6){
                    stringBuilder.append("Шеснадцать ");
                    isEnd=true;
                }else if (d==7){
                    stringBuilder.append("Семнадцать ");
                    isEnd=true;
                }else if (d==8){
                    stringBuilder.append("Восемнадцать ");
                    isEnd=true;
                }else if (d==9){
                    stringBuilder.append("Девятнадцать ");
                    isEnd=true;
                } break;
                case 2: stringBuilder.append("Двадцать ");
                    break;
                case 3: stringBuilder.append("Тридцать ");
                    break;
                case 4: stringBuilder.append("Сорок ");
                    break;
                case 5: stringBuilder.append("Пятьдесят ");
                    break;
                case 6: stringBuilder.append("Шестьдесят ");
                    break;
                case 7: stringBuilder.append("Семьдесят ");
                    break;
                case 8: stringBuilder.append("Восемьдесят ");
                    break;
                case 9: stringBuilder.append("Девяносто ");
                    break;
                default:
            }
            if (!isEnd){
                switch (d){
                    case 0: break;
                    case 1: stringBuilder.append("один ");
                        break;
                    case 2: stringBuilder.append("два ");
                        break;
                    case 3: stringBuilder.append("три ");
                        break;
                    case 4: stringBuilder.append("четыре ");
                        break;
                    case 5: stringBuilder.append("пять ");
                        break;
                    case 6: stringBuilder.append("шесть ");
                        break;
                    case 7: stringBuilder.append("семь ");
                        break;
                    case 8: stringBuilder.append("восемь ");
                        break;
                    case 9: stringBuilder.append("девять ");
                        break;
                    default:
                }
            }
            if (list.get(list.size()-1)==1 && !isEnd){
                stringBuilder.append("рубль");
            } else if (list.get(list.size()-1)>=2 && list.get(list.size()-1)<=4 && !isEnd){
                stringBuilder.append("рубля");
            } else {
                stringBuilder.append("рублей");
            }
        }
        if (list.size()==1){
            int d = list.get(0);
            switch (d){
                case 0: break;
                case 1: stringBuilder.append("Один ");
                    break;
                case 2: stringBuilder.append("Два ");
                    break;
                case 3: stringBuilder.append("Три ");
                    break;
                case 4: stringBuilder.append("Четыре ");
                    break;
                case 5: stringBuilder.append("Пять ");
                    break;
                case 6: stringBuilder.append("Шесть ");
                    break;
                case 7: stringBuilder.append("Семь ");
                    break;
                case 8: stringBuilder.append("Восемь ");
                    break;
                case 9: stringBuilder.append("Девять ");
                    break;
                default:
            }


            if (list.get(list.size()-1)==1){
                stringBuilder.append("рубль");
            } else if (list.get(list.size()-1)>=2 && list.get(list.size()-1)<=4){
                stringBuilder.append("рубля");
            } else {
                stringBuilder.append("рублей");
            }
        }
        return stringBuilder;
    }
}

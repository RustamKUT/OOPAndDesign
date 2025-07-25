public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextStation() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 0;
        }
    }

    public void increaseVolume()  // Увеличение громкости
    {
        if (currentVolume != 100) // Условие если значение не равно 100
        {
            currentVolume++; // То прибавляем +1

        }

    }

    public void decreaseVolume() // Уменьшение громкости
    {
        if (currentVolume != 0) // Условие если значение не равно 0
        {
            currentVolume--; // То убавляем -1
        }
        
    }
    
    


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

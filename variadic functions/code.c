
int  sum (int count,...) {
    int sum = 0;
    va_list p;
    va_start(p,count);
    for(int i=0; i<count; i++) {
        sum += va_arg(p,int);
    }
    va_end(p);
    return sum;
}

int min(int count,...) {
    va_list p;
    va_start(p,count);
    int min = MIN_ELEMENT;
    for(int i=0; i<count; i++) {
       if (min > va_arg(p,int)) {
           min = va_arg(p,int);
       }
    }
    va_end(p);
    return min;

}

int max(int count,...) {   
    int max = MAX_ELEMENT;
    va_list p;
    va_start(p,count);
    for(int i=0; i<count; i++) {
       if (max < va_arg(p,int)) {
           max = va_arg(p,int);
       }
    }
    va_end(p);
    return max;


}


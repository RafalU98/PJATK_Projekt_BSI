# Projekt_BSI by Rafał Ubermanowicz, Marcin Rozkwitalski

### Basic Calculator for this Tasks (formulas where given in PDF-Files):

#### 1. Find FR(%) and FR(N) of produced chips (FR = Fail Rate)
        California Instruments, Inc., produces 3,000 computer chips per day.
        Three hundred are tested for a period of 500 operating hours each.
        During the test, six failed: two after 50 hours, two at 100 hours, one at 300 hours, and one at 400 hours.
        Task : Find FR(%) and FR(N).

        Answer: FR(%) = failures per number tested = 6/300 = 0.02 = 2%
                FR(N) = failures per operating time:
                Total time = 300 * 500 = 150,000 hours
                Downtime = 2(450) + 2(400) + 1(200) + 1(100) = 2,000 hours
                Operating time = Total time – Downtime = 150,000 – 2,000 = 148,000
                Therefore: FR(N) = 6/148,000 = 0.0000405 failures/hour
                MTBF = 1/FR(N) = 24,691 hours //avg work time before fail
         
         
#### 2. Expected Failures of processors per month with failures per hour.
         If 300 of these chips are used in building a mainframe computer, how many failures of the computer can be expected per month?
         
         Answer: Converting the units of FR(N) to months:
                 FR(N) = 0.0000405 * 24 hours/day * 30 days/month = 0.029 failures/month
                 FR(N) for the 300 units:
                 FR(N) = 0.029 failures/month * 300 units = 8.75 failures/month
                 MTBF for the mainframe:
                 MTBF = 1/FR(N) = 1/8.75 = 0.11 month = 0.11 * 30 = 3.4 days
                 Calculation for MTBF assumes that failure of any one chip brings down entire system.
         
         
#### 3. Count the reliability of a system by chaining different reliability blocks
               Example System:
         [0,92]              [0,95]
           |                   |
           |                   |
         [0,95]----[0,98]----[0,90]
    
         Answer: Reliability: 0,95 + 0,92 * (1 - 0,95) * 0,98 * 0,90 + 0,95 * (1 - 0,90) = 0,966 -> 96,6%
    
    

#### 4. Finding Test Life with given miles of life , reliability and confidence
        Design a test to demonstrate 100,000 miles life at 95% reliability and 60% confidence.
        The available sample size is 6.(Assume b=2)

        To = 100,000 [ 1/6 Log (1/(1-0.60)) / Log(1/(1-.05)) ] ) 1/2

        = 100,000 [ 0.153 /0.513 ] 0.5
        = 100,000 x 1.79
        = 179,000 miles 
        
        Answer: Test life 179,000 miles.
        
        
#### 5. Finding out how long you need to test x samples to find out the Goal Life of them
        How long should you test 10 samples of a component which is designed to have 1500
        hours at 80% confidence and 90% reliability? Assume b = 2 (weibull)
        
        To = 1,500 [ 1/6 Log (1/(1-0.80)) / Log(1/(1-.10)) ] ) 1/2

        = 1,500 [ 1.236 ]
        = 1,854 x 1.5
        = 2,781 hours
        
        Answer: 1,854 x 1.5 = 2,781 hours.


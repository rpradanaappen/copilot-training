# Example: Greeting message for morning
# Input: 9 AM
# Output: Good Morning

# Example: Greeting message for afternoon
# Input: 2 PM
# Output: Good Afternoon

# Example: Greeting message for evening
# Input: 6 PM
# Output: Good Evening

# Now, generate a python code that takes the current time as input using the datetime module and prints the greeting message based on the current time.
# and returns the greeting message based on the current time.

# Solution:
# Importing the datetime module
import datetime

# Function to get the greeting message based on the current time
current_time = datetime.datetime.now()

#Check if it is morning (before 12PM)
if current_time < 12:
    print("Good Morning")

#Check if it is afternoon (between 12PM and 6PM)
elif current_time < 18:
    print("Good Afternoon")

#Check if it is evening (after 6PM)
elif current_time < 22:
    print("Good Evening")

# else it is night time
else:
    print("Good Night")

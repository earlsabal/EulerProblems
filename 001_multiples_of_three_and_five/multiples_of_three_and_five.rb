# Finds multiples of three or five below a given number, 
#   and finds the sum of the multiples
def sum_of_multiples(below_num)
  sum = 0
  for i in 0...below_num do
    if i % 3 == 0
      sum += i
    elsif i % 5 == 0
      sum += i
    end
  end
  sum
end

# Tracks time
start = Time.now
puts sum_of_multiples(1000)
puts Time.now - start
# Answer: 233168
# Time Elapsed: 0.001
def sum_of_evens(max)
	previous = 1
	current_num = 2
	next_num = 2

	sum = 0
	while current_num <= max 
		sum += next_num if next_num % 2 == 0
		next_num = previous + current_num
		previous = current_num
		current_num = next_num
	end
	sum
end

# Tracks time
start = Time.now
puts sum_of_evens(4000000)
# Answer: 4613732
puts "Execution time: #{Time.now - start}"
# Time Elasped: 0.000088637